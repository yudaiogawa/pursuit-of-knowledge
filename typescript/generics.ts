/*
  - Generics
  - Use type variable.
*/

function identity<T>(arg: T): T {
    return arg;
}

let msg_type_difinition = identity<string>("Hello world - type difinition");
console.log(msg_type_difinition);

let msg_type_inference = identity("Hello world - type inference")
console.log(msg_type_inference);
