## compdfkit-pdf-api-java

This is the compdfkit-pdf-api Java SDK  for the [ComPDFKit](https://api.compdf.com/api/docs/introduction) API.

## Requirements

JAVA JDK 1.8 and later.

Maven.

## Installation

Add the following dependency to your pom.xml:

```
<dependency>
    <groupId>com.compdf</groupId>
    <artifactId>compdfkit-pdf-api-java</artifactId>
    <version>0.0.5</version>
</dependency>
```

## Create API Client

You can use your **publicKey** and **secretKey** to complete the authentication

Project public Key : You can find the public key in [Management Panel](https://api-dashboard.compdf.com/api/keys).

Project secret Key : You can find the secret Key in [Management Panel](https://api-dashboard.compdf.com/api/keys).

```java
CPDFClient client = new CPDFClient(<publicKey>, <secretKey>);
```

## Create Task

A task ID is automatically generated for you based on the type of PDF tool you choose. You can provide the callback notification URL. After the task processing is completed, we will notify you of the task result through the callback interface. You can perform other operations according to the task result, such as downloading the result file.

```java
// Create a client
CPDFClient client = new CPDFClient(<publicKey>, <secretKey>);

// Create a task
// Create an example of a PDF TO WORD task
CPDFCreateTaskResult result = client.createTask(CPDFConversionEnum.PDF_TO_WORD.getValue());

// Get a task id
String taskId = result.getTaskId();

// Upload files
client.uploadFile(<convertFile>, taskId);

// execute Task
client.executeTask(taskId);
```

## Upload Files

Upload the original file and bind the file to the task ID. The field parameter is used to pass the JSON string to set the processing parameters for the file. Each file will generate automatically a unique filekey. Please note that a maximum of five files can be uploaded for a task ID and no files can be uploaded for that task after it has started.



```java
// Create a client
CPDFClient client = new CPDFClient(<publicKey>, <secretKey>);

// Create a task
// Create an example of a PDF TO WORD task
CPDFCreateTaskResult result = client.createTask(CPDFConversionEnum.PDF_TO_WORD.getValue());

// Get a task id
String taskId = result.getTaskId();

// Upload files
client.uploadFile(<convertFile>, taskId);

// execute Task
client.executeTask(taskId);
```



## Execute the task

After the file upload is completed, call this interface with the task ID to process file.

```java
// Create a client
CPDFClient client = new CPDFClient(<publicKey>, <secretKey>);

// Create a task
// Create an example of a PDF TO WORD task
CPDFCreateTaskResult result = client.createTask(CPDFConversionEnum.PDF_TO_WORD.getValue());

// Get a task id
String taskId = result.getTaskId();

// Upload files
client.uploadFile(<convertFile>, taskId);

// execute Task
client.executeTask(taskId);
```

## Get TaskInfo

Request task status and file-related metadata based on the task ID.

```java
// Create a client
CPDFClient client = new CPDFClient(<publicKey>, <secretKey>);

// Create a task
// Create an example of a PDF TO WORD task
CPDFCreateTaskResult result = client.createTask(CPDFConversionEnum.PDF_TO_WORD.getValue());

// Get a task id
String taskId = result.getTaskId();

// Upload files
client.uploadFile(<convertFile>, taskId);

// execute Task
client.executeTask(taskId);

// query TaskInfo
CPDFTaskInfoResult taskInfo = client.getTaskInfo(taskId);
```

## Resources

* [ComPDFKit API Documentation](https://api.compdf.com/api/docs/introduction)
