rootProject.name = "chapi"

include(
    ":chapi-domain",
    ":chapi-application"
)

include(
    ":chapi-ast-java",
    ":chapi-ast-typescript",
    ":chapi-ast-go",
    ":chapi-ast-python",
    ":chapi-ast-c",
    ":chapi-ast-csharp",
    ":chapi-ast-kotlin",
    ":chapi-ast-scala",
    ":chapi-ast-cpp"
)

