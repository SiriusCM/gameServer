@echo off

set name=Login
 .\protoc.exe --java_out=java/ proto/%name%.proto
  .\protoc.exe --csharp_out=C#/ proto/%name%.proto
  
set name=Match
 .\protoc.exe --java_out=java/ proto/%name%.proto
  .\protoc.exe --csharp_out=C#/ proto/%name%.proto
pause