@echo off

set name=ProtoBuf
 .\protoc.exe --java_out=java/ proto/%name%.proto
  .\protoc.exe --csharp_out=C#/ proto/%name%.proto
 .\protoc.exe --objc_out=oc/ proto/%name%.proto
 
pause