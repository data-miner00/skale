# Skale

A sandbox for me to mess around with Scala.

## Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL. To quit the REPL, enter `:q` to the prompt.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).

## Tips

`:imports`, `:settings` and getting help.

For compilation,

```
scalac First.scala Second.scala -d target.jar -Xmain-class Second
```

To view Jar Metadata,

```
jar -tvf target.jar
```

To run Jar file,

```
scala -cp <jar> <file> <args>
```

## Resources

- [Scala Docs](https://docs.scala-lang.org/)
- [Scala 3 Book](https://docs.scala-lang.org/scala3/book/introduction.html)
- [sbt](https://www.scala-sbt.org/)
- [Oracle Docs](https://docs.oracle.com/en/)
- [Scala 2 Language: Getting Started by Harit Himanshu | Pluralsight](https://app.pluralsight.com/library/courses/scala-language-getting-started/table-of-contents)
