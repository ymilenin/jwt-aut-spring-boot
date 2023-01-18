In order to generate RSA Key Pair you need in terminal go to ```src/main/resources/certs``` and run the next command 
one 
by one
```
openssl genrsa -out keypair.pem 2048

openssl rsa -in keypair.pem -pubout -out public.pem

openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem

rm keypair.pem
```
