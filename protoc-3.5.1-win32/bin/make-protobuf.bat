@echo off

set name=Message
 .\protoc.exe --java_out=java/ proto/%name%.proto
  .\protoc.exe --csharp_out=C#/ proto/%name%.proto
pause