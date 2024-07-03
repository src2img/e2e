
if (process.version.startsWith('v18.')) {
    console.log('This runs with the expected Node version 18.');
} else {
    console.error(`I am expecting Node version 18, but I am running ${process.version}.`);
    process.exit(1);
}