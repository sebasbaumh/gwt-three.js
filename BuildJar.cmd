@echo off
cd /d "%~dp0%"
REM get name of current directory
for %%* in (.) do set CURRENTDIRECTORY=%%~n*
REM find JDK home
FOR /D %%* in ("%PROGRAMFILES%\Java\jdk*") do set JDKHOME=%%*
REM set paths
set JAR_FILE=%CURRENTDIRECTORY%.jar
set JAR_SRC=src
set JAR_BIN=war\WEB-INF\classes

REM pack main app
del %JAR_FILE% > nul
echo packing %JAR_SRC% to %JAR_FILE%
"%JDKHOME%\bin\jar" cf %JAR_FILE% -C %JAR_SRC% .
echo packing %JAR_BIN% to %JAR_FILE%
"%JDKHOME%\bin\jar" uf %JAR_FILE% -C %JAR_BIN% .
pause
