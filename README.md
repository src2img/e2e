# e2e

This repository contains branches with sample code for our e2e tests.

This branch contains a React application that is served through [serve](https://www.npmjs.com/package/serve).

A couple of notes on this:

1. The `.buildenv` causes the build and the clean-sources scripts to run at build time. The purpose of clean-sources is to prevent that source code is included in the resulting image.
2. The code is served by serve.
3. The package.json may look weird, but basically all React things are moved to devDependencies and only serve is in dependencies. The reason is that React is only needed at build time. At runtime, only serve is required. Also, the `start` script was renamed to `dev` because otherwise, Paketo will make the default `start` script the entrypoint of the image which we do not want as it would run React's dev server. We want it to run serve instead.
