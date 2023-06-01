# Exercise 5

In this exercise, we will explore the usage of logging libraries, focusing on Log4J.

- **Why are logging libraries used?**
  Logging libraries are used to facilitate the logging of events and messages during the execution of a program. They provide a structured way to capture information, warnings, errors, and other relevant details.

- **Log levels in Log4J:**
  Log4J provides several log levels, including TRACE, DEBUG, INFO, WARN, ERROR, and FATAL. These levels allow developers to control the verbosity of the logs and filter messages based on their severity.

- **Configuration options in Log4J:**
  Log4J offers various configuration options to customize the logging behavior, such as specifying log output destinations, defining log formats, setting log levels for different loggers, and configuring log appenders.

For more details, please refer to the full documentation.

# Configuration

This project uses Log4j for logging. The configuration for Log4j is not included in the version control system, as it may contain individual system paths or settings. Instead, a template configuration file (`log4j2.xml.template`) is provided, which you can use as a starting point.

To set up the logging for this project, please follow these steps:

1. Copy the file `log4j2.xml.template` and rename the copy to `log4j2.xml`.
2. Adjust the `fileName` attribute in the `File` appender in the `log4j2.xml` file to match your system setup.
3. Ensure that the `log4j2.xml` file is located in the `src/main/resources` directory of your project.

Logs will be stored in the specified log file (by default `logs/myapp.log`), and new log entries will be appended to existing ones. The log messages will include the date/time and a brief description of the logged event.