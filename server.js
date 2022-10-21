const express = require('express');
const path = require('path');

const app = express();

// serve a simple API call
app.get('/sample-api', (_, res) => res.send({
  "hello": "world"
}));

// serve the static content from the Angular build, /dist comes from the angular.json, outputPath
app.use(express.static(path.join(__dirname, 'dist')));
app.get('/[^\.]+$', (_, res) => res.sendFile(path.join(__dirname, 'dist/index.html')));

// start the server
const port = process.env.PORT ? parseInt(process.env.PORT, 10) : 8080;
console.log(`Starting server on port ${port}`);
const server = app.listen(port);

// graceful shutdown on SIGTERM
process.on('SIGTERM', () => {
  console.log(`Stopping server`);
  server.close();
});
