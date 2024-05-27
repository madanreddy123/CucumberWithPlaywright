const { chromium } = require('playwright');

(async () => {
    const browserServer = await chromium.launchServer({
        headless: false  // Launch the browser in non-headless mode
    });
    console.log(`WebSocket server started at ${browserServer.wsEndpoint()}`);
})();
