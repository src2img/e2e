const appRootPath = require('app-root-path');

console.log(`app-root-path: ${appRootPath}`);

// Import the simple function using app-root-path

const simpleFunction = require(`${appRootPath}/lib/lib`).simpleFunction;

console.log(simpleFunction());
