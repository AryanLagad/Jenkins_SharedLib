def call(){
  sleep(time: 5, unit: "SECONDS")  // Give webhook time to arrive
  timeout(time: 5, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
  }
}
