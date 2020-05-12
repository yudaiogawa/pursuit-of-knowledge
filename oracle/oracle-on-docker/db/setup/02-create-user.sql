create user TEST_USER identified by passwd
default tablespace TEST_USER temporary tablespace TEMP;

grant connect, resource to TEST_USER;
