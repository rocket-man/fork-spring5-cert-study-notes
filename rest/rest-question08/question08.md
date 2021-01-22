# Is REST normally stateless?
Yes, REST is normally stateless.

Statelessness is one of the basic constraints for Systems following RESTful Architecture.

Each request from client should contain all required information to handle request.

If system is unable to process each request independently, because of state being required on server side, then such system
is no longer RESTful System since it violates one of the basic principal of RESTful Architecture.

If some kind of state is required for the request, client should send this state with each request, however this state should 
not be kept on server side, for example, state should not be kept in HTTP Session.