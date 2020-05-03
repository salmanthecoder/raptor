# raptor
E2E test script for apps having normal and shadow dom

command to run test : mvn clean test

Usually shadom dom's are pain for testing. With code like raptor now its very easy to create scripts which penetrates shadom dom like a bullet.

This will also ease creating scripts for multiple features in seconds.

Now anyone without having knowledge of technical jargons can write tests.

Follow below steps and you are good to go.

1) Crete test-script.json

eg) [
      {
        "stepName": "navigate to url",
        "action": "navigate",
        "time": 2000,
        "locator": "document.querySelector()",
        "url": "'https://www.alodokter.com/'"
      },
      {
        "stepName": "click Cari Dokter",
        "action": "click",
        "time": 2000,
        "locator": "document.querySelector()"
      },
      {
        "stepName": "click city scan",
        "action": "click",
        "time": 2000,
        "locator": "document.querySelector()"
      },
      {
        "stepName": "click Doktor",
        "action": "click",
        "time": 2000,
        "locator": "document.querySelector()"
      },
      {
        "stepName": "input value",
        "action": "input",
        "time": 2000,
        "locator": "document.querySelector()",
        "inputValue": "'test'"
      }
    ]
    
2) Navigate to url of your website
3) Copy url and paste it in first step with navigate action.
4) Now decide if you need to click on same button or provide an input.
5) According choose your step with that action and set the required values.
6) Set time becuse it might take a while to load the page.
7) Keep on repeating the steps for one feature.
8) Copy this json and paste for other feature and repeat the same steps.
9) Add a new test with the new file name.


