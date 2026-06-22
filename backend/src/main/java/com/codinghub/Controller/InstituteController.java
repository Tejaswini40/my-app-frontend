package com.codinghub.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.Entity.Institute;
import com.codinghub.Service.InstituteService;

@RestController
@CrossOrigin
@RequestMapping("/institutes")//unique finding of controller
public class InstituteController {

    @Autowired
    private InstituteService service;

    // 1. Save one: removed @PathVariable long id (POST has no ID in path)
    @PostMapping
    public Institute save(@RequestBody Institute institute) 
    {
        return service.save(institute);
    }
 // 2. Save all
    @PostMapping("/insertAll")
    public Iterable<Institute> saveAll(@RequestBody List<Institute> institutes) 
    {
        return service.saveAll(institutes);
    }

    // 3. Delete one
    @DeleteMapping("/id/{id}")
    public String delete(@PathVariable long id) 
    {
        return service.delete(id);
    }

    // 4. Delete all
    @DeleteMapping("/delete")
    public int deleteAll() 
    {
        return service.deleteAll();
    }

    // 5. Find all
    @GetMapping("/findAll")
    public Iterable<Institute> findAll() 
    {
        return service.findAll();
    }
 // 6. Find by ID
    @GetMapping("/id/{id}")
    public Optional<Institute> findById(@PathVariable long id) 
    {
        return service.findById(id);
    }

    // 7. Find by name
    @GetMapping("/name/{name}")
    public Optional<Institute> findByName(@PathVariable String name) 
    {
        return service.findByName(name);
    }

    // 8. Find by location
    @GetMapping("/location/{location}")
    public Optional<Institute> findByLocation(@PathVariable String location) 
    {
        return service.findByLocation(location);
    }

    // 9. Find by fee
    @GetMapping("/fee/{fee}")
    public Optional<Institute> findByFee(@PathVariable Double fee) 
    {
        return service.findByFee(fee);
    }
 // 10. Find by faculty
    @GetMapping("/faculty/{faculty}")
    public Optional<Institute> findByFaculty(@PathVariable String faculty) 
    {
        return service.findByFaculty(faculty);
    }

    // 11. Partial update (PATCH)
    @PatchMapping("/id/{id}")
    public Institute partialUpdate(@RequestBody Institute institute, @PathVariable long id) 
    {
        return service.partialUpdate(institute, id);
    }

    // 12. Full update (PUT)
    @PutMapping("/id/{id}")
    public Institute update(@RequestBody Institute institute, @PathVariable long id) 
    {
        return service.update(institute, id);
    }

    // 13. Custom query
    @GetMapping("/custom")
    public List<Institute> customQuery() 
    {
        return service.customQuery();
    }
    // 14. Pagination
    @GetMapping("/pagination")
    public List<Institute> pagination() 
    {
        return service.pagination();
    }

    // 15. AND query
    @GetMapping("/and/{name}/{total}")
    public List<Institute> findByNameAndTotal(@PathVariable String name, @PathVariable double total) 
    {
        return service.findByNameAndTotal(name, total);
    }

    // 16. OR query
    @GetMapping("/or/{name}/{id}")
    public List<Institute> findByNameOrId(@PathVariable String name, @PathVariable long id) 
    {
        return service.findByNameOrId(name, id);
    }
 // 17. Between
    @GetMapping("/between/{start}/{end}")
    public List<Institute> findByIdBetween(@PathVariable long start, @PathVariable long end) 
    {
        return service.findByIdBetween(start, end);
    }

    // 18. Greater than
    @GetMapping("/greater/{num}")
    public List<Institute> findByIdGreaterThan(@PathVariable long num) 
    {
        return service.findByIdGreaterThan(num);
    }

    // 19. Less than: variable name was "id" but type said int (now long num)
    @GetMapping("/lessthan/{num}")
    public List<Institute> findByIdLessThan(@PathVariable long num) 
    {
        return service.findByIdLessThan(num);
    }

    // 20. Sort
    @GetMapping("/sort")
    public List<Institute> sort(@RequestParam String field) 
    {
        return service.sort(field);
    }
    // 21. Like :was using @PathVariable but mapped to @RequestParam correctly
    @GetMapping("/like")
    public List<Institute> findByNameLike(@RequestParam String name) 
    {
        return service.findByNameLike(name);
    }
}
    
