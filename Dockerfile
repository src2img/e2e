FROM busybox
RUN adduser -D static
USER static
WORKDIR /home/static
COPY . .
RUN sleep 3600
CMD ["busybox", "httpd", "-f", "-v", "-p", "8080"]
