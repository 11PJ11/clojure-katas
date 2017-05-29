# Clojure TDD Katas

## Description
Learning clojure through some basic TDD katas to get used to the language and basic libraries.

## Might be Useful

Use [lein test refresh plugin](https://github.com/jakemcc/lein-test-refresh) to run your tests continuously.
To start the continuous runner use the following command `lein test-refresh`.
Use [ultra plugin](https://github.com/venantius/ultra) to improve the output.

### Example

 This is an example of a possible `profile.clj` file located at `~/.lein/profiles.clj`
```
    {:user 
        {:plugins
            [[com.jakemccrary/lein-test-refresh "0.20.0"]
            [venantius/ultra "0.5.1"]]}}
```

## License

Copyright © 2017

Distributed under the Eclipse Public License either version 1.0 or any later version.