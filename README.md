# This is GeorgeHotzSucks.scala

This is a polished implementation of **twitter based finagle-thrift** server and **Python 3 based client**. This is much better than George Hotz in one of his stream can be found at - 
https://www.youtube.com/watch?v=nvtoOxNfDQo ,all because **_GeorgeHotzSucks.scala_**!.

### Requirements
- Scala 2.13.10
- Python 3.8+
- Apache Thrift 0.16.0 or 0.14.0+

### Setup 
- For Thrift
  - INSTALL APACHE THRIFT via dnf or apt or other means.
```bash
pip install thrift
thrift -gen py multiply.service.thrift
 ```
- For Scala
  - Install Scala 2.13.10 & sbt 1.8.0  
```bash
sbt clean
sbt compile
sbt run
```
MAKE SURE ABOVE SERVER IS RUNNING
- For Python
```bash
cd python-thrift
python client.py

Enter q to quit or any other key to continue: 454

 Enter first number: 45

 Enter second number: 452

Product:  20340
```

The server output after you call RPC/thrift interface
```bash
[info] running georgehotzsucksFinaglePOC.screamingServer 
Nov 28, 2022 8:37:03 AM com.twitter.jvm.Jvm$ liftedTree2$1
Nov 28, 2022 8:37:04 AM com.twitter.finagle.Init$ $anonfun$once$1
INFO: Finagle version 22.7.0 (rev=4d10525ef4fe89732bcfec6286fac7fe426e9082) built at 20220728-183850
Multiplying 45 and 452
```