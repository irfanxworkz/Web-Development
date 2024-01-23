package com.xworkz.persion.controller;

@Controller
@RequestMapping("/persons")
public class PersionController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public String getAllPersons(Model model) {
        List<PersonDTO> persons = personService.getAllPersons();
        model.addAttribute("persons", persons);
        return "persons/list";
    }

    @GetMapping("/{id}")
    public String getPersonById(@PathVariable Long id, Model model) {
        PersonDTO person = personService.getPersonById(id);
        model.addAttribute("person", person);
        return "persons/details";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("person", new PersonDTO());
        return "persons/add";
    }

    @PostMapping("/add")
    public String addPerson(@ModelAttribute("person") PersonDTO personDTO) {
        personService.savePerson(personDTO);
        return "redirect:/persons";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        PersonDTO person = personService.getPersonById(id);
        model.addAttribute("person", person);
        return "persons/edit";
    }

    @PostMapping("/edit/{id}")
    public String updatePerson(@PathVariable Long id, @ModelAttribute("person") PersonDTO updatedPersonDTO) {
        personService.updatePerson(id, updatedPersonDTO);
        return "redirect:/persons";
    }

    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return "redirect:/persons";
    }
}