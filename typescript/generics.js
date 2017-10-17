/*
  - Generics
  - Use type variable.
*/
function identity(arg) {
    return arg;
}
var msg_type_difinition = identity("Hello world - type difinition");
console.log(msg_type_difinition);
var msg_type_inference = identity("Hello world - type inference");
console.log(msg_type_inference);
