# What is the difference between @RequestMapping and @GetMapping?
The main difference is that ```@RequestMapping``` can be used to map any HTTP method request and ```@GetMapping``` can only
be mapped with HTTP GET method request. ```@GetMapping``` is less flexible, but easier to use.

```@GetMapping``` annotation is a composed annotation that is equal to ```@RequestMapping(method = RequestMethod.GET)```

Both annotations allow you to specify multiple criteria for request mapping, like URI path, required header, consumable media types,
producible media types, however only ```@RequestMapping``` allows you to specify HTTP Method through ```method``` field. 
If none HTTP methods are specified, all of HTTP method will be mapped.

Spring also includes other specialized versions of ```@RequestMapping```:
- ```@PostMapping```
- ```@PutMapping```
- ```@PathMapping```
- ```@DeleteMapping```

Usage of those simpler, specialized versions is recommended for simple HTTP method mappings.