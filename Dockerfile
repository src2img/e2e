FROM busybox
CMD ["busybox", "httpd", "-f", "-v", "-p", "8080"]
