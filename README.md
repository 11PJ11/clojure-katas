# Clojure TDD Katas

## Description
Learning clojure through some basic TDD katas to get used to the language and basic libraries.

## Might be Useful

Use this lein plugin to run your tests continuously:

```
    https://github.com/jakemcc/lein-test-refresh
```

To start the contunuous runner just use the following command `lein test-refresh`

And this plugin to improve the output
```
    https://github.com/venantius/ultra
```

### Example

 This is an example of a possible `profile.clj` file located at `~/.lein/profiles.clj`
```
    {:user 
        {:plugins
            [[com.jakemccrary/lein-test-refresh "0.20.0"]
            [venantius/ultra "0.5.1"]
            [mvxcvi/whidbey "1.3.1"]]}}
```

## License

Copyright © 2017

Distributed under the Eclipse Public License either version 1.0 or any later version.