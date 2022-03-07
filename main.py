import http.server
import socketserver


PORT = 8080

handler = http.server.SimpleHTTPRequestHandler

with socketserver.TCPServer(("", PORT), handler) as httpd:
    print("INFO: Accepting connections at http://localhost:" + str(PORT))
    httpd.serve_forever()
