# Curl Commands

---

_[Markdown Cheatsheet](https://www.markdownguide.org/cheat-sheet/)
Full-Preview: Ctrl + Shift + V
To-the-Side-Preview: Ctrl + K, realease, then V_

---

#### Simple GET Request

```
curl http://localhost:8080/<Endpoint>
```

#### POST Request with request body

```
curl -X POST -H "Content-Type: application/json" -d '{"key1": "value1", "key2": "value2"}' <URL>
```

**Breakdown:**

-X POST: Specifies a POST request.
-H "Content-Type: application/json": Sets the Content-Type header to indicate that the request body is JSON. Adjust the content type if you're sending data in a different format (e.g., application/x-www-form-urlencoded for form data).
-d '{"key1": "value1", "key2": "value2"}': Provides the request body as a JSON string. Replace the placeholder values with your actual data

##### Pre-Loaded for Project

```
curl -X POST -H "Content-Type: application/json" -d '{
    "name": "Burger King",
    "city": "Troy",
    "state": "Ohio",
    "zipCode": "45373",
    "peanutScore": "5",
    "eggScore": "5",
    "dairyScore": "5",
    "overAllScore": "5"
    }' http://localhost:8080/restaurants/newRestaurant
```
