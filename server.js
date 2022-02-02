const package = require('simple-test-package');

if (typeof package !== 'object') {
    console.log('Failed to load library.');
    process.exit(1);
}

console.log('Yeah from app.js with package.json!');