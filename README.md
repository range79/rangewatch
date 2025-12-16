## RangeWatch (Just anime backend API)

### Features:

- User Auth
- User Profiles
- Anime adding
- Season Adding
- Episode Adding
- bla bla I'm so lazy to add more

## How to start

### Prerequisites

1. Find **`example.env`** and make your env like that

2Run with this command if you run in some other IDE:
```shell
export $(grep -v '^#' .env | xargs) && ./gradlew bootRun
```

### If you're using IntelliJ IDEA, add env file in app startup