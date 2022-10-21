# e2e

This repository contains branches with sample code for our e2e tests.

This branch contains an Angular application that is served through Express.

A couple of notes on this:

1. The `.buildenv` causes the build and the clean-sources scripts to run at build time. The purpose of clean-sources is to prevent that source code is included in the resulting image.
2. The code is served by Express in the server.js. This server.js also includes a simple API endpoint to show how static files can be server together with an API endpoint. The server.js also contains handling of the SIGTERM signal to properly shutdown when a pod gets terminated.
3. The package.json may look weird, but basically all Angular things are moved to devDependencies and only Express is in dependencies. The reason is that Angular is only needed at build time. At runtime, only Express is required. Also, the `start` script was renamed to `dev` because otherwise, Paketo will make the `start` script the entrypoint of the image which we do not want as it would run Angular's dev server. We want it to run the server.js instead.
