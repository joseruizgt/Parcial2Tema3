@RequestMapping("/bye")
public String bye(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
model.addAttribute("name", name);
return "bye";
}