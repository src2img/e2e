import http.server
import socketserver
from termcolor import cprint


PORT = 8080

handler = http.server.SimpleHTTPRequestHandler

with socketserver.TCPServer(("", PORT), handler) as httpd:
    cprint("INFO: Accepting connections at http://localhost:" + str(PORT), "magenta")
    httpd.serve_forever()
