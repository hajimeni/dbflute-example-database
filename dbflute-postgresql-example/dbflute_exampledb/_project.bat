@echo off

set ANT_OPTS=-Xmx512M

set DBFLUTE_HOME=..\mydbflute\dbflute-1.x

set MY_PROJECT_NAME=nextschema

set MY_PROPERTIES_PATH=build.properties

if "%pause_at_end%"=="" set pause_at_end=y
