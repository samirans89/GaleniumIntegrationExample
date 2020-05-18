#!/bin/bash


addGoal clean
addGoal install
addProfile "local-dev"

# Always update snapshots
# addArg "-U";
# Never download dependencies
# addArg "-o";

#verbose reporting
addDef "galenium.report.sparse=false"

# addTests "MyTest"

#show browser
addDef "galenium.headless=false"
addDef "selenium.browser=remote_chrome,remote_firefox,remote_safari,remote_edge,remote_opera,remote_ie"
addDef "galenium.webdriver.alwaysNew=true"

addDef "maven.javadoc.skip=true"
addDef "selenium.runmode=remote"
addDef "selenium.capabilities=parallel.conf.json"
addDef "io.wcm.qa.baseUrl=https://www.google.com"
addDef "selenium.user=BROWSERSTACK_USERNAME"
addDef "selenium.access_key=BROWSERSTACK_ACCESS_KEY"
addDef "selenium.host=https://hub-cloud.browserstack.com"
addDef "selenium.port=443"