
if (process.version.startsWith('v20.')) {
    console.log('This runs with the expected Node version 20.');
} else {
    console.error(`I am expecting Node version 20, but I am running ${process.version}.`);
    process.exit(1);
}