1. There are to options to link a repository to a controller.

   1. Using autowired
   2. Add it to a field of the class, and include it in the constructor. It will be automatically wired.(The way codecademy teaches).

2. If your making a POST or PUT request there are two things to note.

   1. If your using a request body sent by the user you DO NOT NEED to create a new instance of the class object before saving it.
      The request body annoation automatically deserializes the response and converts it into an object so it can be used directly in the
      save method.
   2. If your using request parameters you DO NEED need to create a new instance of the class object. You would store it in a variable
      and then pass it to the save method.

3. Think about how to use services for business logic. Link the Repo to a service that contains methods to accomplish tasks. Then link the service
   to the controller.

4. Remember there are some things that need to be worked out. Such as the optional fields in the reviews.
