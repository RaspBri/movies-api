Model class uses service class and repository class to manipulate the database

If the local port is already in use, here is how to fix the error:
1. Identitfy the process using Port 8080 with command 'lsof -i :8080'
2. Locate the PID # from the result of that command
3. Use command 'sudo kill -9 [PID #]'
4. Restart application and run
