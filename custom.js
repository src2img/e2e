const package = require('simple-test-package');

if (typeof package !== 'object') {
    console.log('Failed to load library.');
    process.exit(1);
}

console.log('Yeah from custom.js with package.json!');