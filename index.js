
if (process.version.startsWith('v16.')) {
    console.log('This runs with the expected Node version 16.');
} else {
    console.error(`I am expecting Node version 16, but I am running ${process.version}.`);
    process.exit(1);
}