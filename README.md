# circle-env-var
Demonstrates ability to expose "secret" env vars in CircleCI builds

## Usage
1. Add "secret" env var $FOO in repository settings on CircleCI
2. Run build on CircleCI; test class `EnvVarTest` will output the following:

```
> Task :test

EnvVarTest > printsEnvVar STANDARD_OUT
    Your super-secret env var $FOO is: MySuperSecretHiddenValue

```