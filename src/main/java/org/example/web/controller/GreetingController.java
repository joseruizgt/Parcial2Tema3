@RequestMapping("/bye")
public String bye(@RequestParam(value="name", required=false, defaultValue="Universe") String name, Model model) {
model.addAttribute("name", name);
return "bye";
}