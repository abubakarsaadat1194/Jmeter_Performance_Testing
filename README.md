# Performance Testing with Apache JMeter

This repository contains a **performance testing project using Apache JMeter** developed as part of the **Web and Mobile Testing with Selenium** course offered by the **University of Minnesota**.

The project demonstrates how to design, execute, and analyze performance tests for web applications using JMeter.

---

## Project Overview

Performance testing is essential for evaluating how applications behave under different levels of load and stress. In this project, Apache JMeter was used to simulate multiple users interacting with a web service and to measure system performance.

The goal of this project was to:

- Simulate concurrent users accessing a web application
- Measure response times and throughput
- Identify performance bottlenecks
- Analyze results using JMeter reports

---

## Tools and Technologies

- **Apache JMeter**
- **HTTP Request Samplers**
- **Thread Groups**
- **Listeners and Reports**
- **Performance Metrics Analysis**

---

## Key Concepts Implemented

- Load testing
- Stress testing
- Thread group configuration
- HTTP request testing
- Performance monitoring
- Response time analysis
- Throughput measurement

---

## Project Structure
```
performance-testing-jmeter/
│
├── test-plan.jmx # Main JMeter test plan
├── results/ # Test execution output
├── reports/ # Generated performance reports
├── screenshots/ # Optional screenshots of test results
└── README.md # Project documentation
```

---

## Test Plan Description

The JMeter test plan includes:

### Thread Group
The thread group simulates multiple virtual users interacting with the application.

Parameters configured:

- Number of Users (Threads)
- Ramp-Up Period
- Loop Count

### HTTP Request Sampler
Used to send HTTP requests to the target application endpoint.

### Listeners
Listeners collect and display test results including:

- View Results Tree
- Summary Report
- Aggregate Report
- Graph Results

---

## Running the Performance Test

### 1. Install Apache JMeter

Download JMeter from the official website:

https://jmeter.apache.org/download_jmeter.cgi

Extract the downloaded archive.

---

### 2. Launch JMeter

Run JMeter using:

**Mac/Linux**
bin/jmeter

**Windows**

bin/jmeter.bat

---

### 4. Run the Test

Click the **Start (▶)** button in JMeter to execute the performance test.

---

### 5. Analyze Results

Results can be analyzed using JMeter listeners such as:

- Summary Report
- Aggregate Report
- View Results Tree
- Graph Results

These reports provide insights into application performance under load.

---

## Performance Metrics Measured

The test evaluates several important performance indicators:

| Metric | Description |
|------|-------------|
| Response Time | Time taken for the server to respond |
| Throughput | Number of requests processed per second |
| Latency | Time taken for request to reach server |
| Error Rate | Percentage of failed requests |
| Requests per Second | System capacity under load |

---

## Example Performance Report

Example metrics collected during testing may include:

- Average response time
- Median response time
- 90th percentile response time
- Maximum response time
- Throughput statistics

These metrics help identify performance issues and system limitations.

---

## Learning Outcomes

Through this project I gained hands-on experience with:

- Designing performance testing strategies
- Creating JMeter test plans
- Simulating concurrent users
- Running load tests
- Analyzing performance metrics
- Identifying potential performance bottlenecks

---

## Course Information

This project was completed as part of the course:

**Web and Mobile Testing with Selenium**

Offered by the **University of Minnesota**

The course covers:

- Web automation with Selenium
- Test planning and strategies
- XPath and web element inspection
- Security testing concepts
- Performance testing with JMeter
- Mobile automation with Appium

---

## Author

**Abu Bakar Saadat**

Software Testing | Test Automation | Mobile Testing | Performance Testing

---

## License

This project is provided for **educational purposes only**.
