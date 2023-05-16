FROM python:3.10

RUN pip install --upgrade pip && pip --version

RUN \
  echo "a-user:x:1000:1000:a-user:/home/a-user:/bin/bash" >/etc/passwd && \
  echo "a-group:x:1000" >/etc/group && \
  mkdir -p /home/a-user/app && \
  chown -R 1000:1000 /home/a-user

USER 1000:1000

WORKDIR /home/a-user/app

COPY --chown=1000:1000 requirements.txt requirements.txt
RUN pip install --requirement requirements.txt --exists-action=w --compile --user --disable-pip-version-check --cache-dir /tmp

COPY --chown=1000:1000 main.py main.py

ENTRYPOINT [ "python", "main.py" ]
