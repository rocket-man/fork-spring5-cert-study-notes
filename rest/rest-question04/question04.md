# Is REST secure? What can you do to secure it?
REST as an architectural style of developing distributed applications, does not enforce any security rules or solutions 
on it's own, so by default REST is not secured.

However, since it suggests layered approach to system design, security can be added later in the process.

In Spring, this can be easily achieved by using Spring REST and Spring Security module.

To secure REST API, you can do following:
- Protect in-transit traffic by using HTTPS protocol
- Use some form of Authentication (Basic, JSON Tokens, ...)
- Use some sort of Authorization (Spring roles)

