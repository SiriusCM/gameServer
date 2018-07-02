@echo off

set name=ProtoBuf
 .\protoc.exe --java_out=java/ proto/%name%.proto
  .\protoc.exe --csharp_out=C#/ proto/%name%.proto
 
pause