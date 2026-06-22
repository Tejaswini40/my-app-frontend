package com.codinghub.Service;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import com.codinghub.Entity.Institute;
import com.codinghub.Repository.InstituteRepository;

@Service
public class InstituteService {

    @Autowired
    private InstituteRepository repository;

    // 1. Save one
    public Institute save(Institute institute) 
    {
        return repository.save(institute);
    }
    // 2. Save all  ← FIX: was returning null
    public Iterable<Institute> saveAll(List<Institute> institutes) 
    {
        return repository.saveAll(institutes);
    }

    // 3. Delete one  ← FIX: was never calling deleteById!
    public String delete(long id) 
    {
        Optional<Institute> opt = repository.findById(id);
        if (opt.isPresent()) 
        {
            repository.deleteById(id); // ← the missing line
            return "Institute with id=" + id + " deleted successfully";
        } else 
        {
            return "Institute with id=" + id + " does not exist";
        }
    }

    // 4. Delete all  ← FIX: was returning 0
    public int deleteAll() 
    {
        long count = repository.count();
        repository.deleteAll();
        return (int) count;
    }
 // 5. Find all
    public Iterable<Institute> findAll() 
    {
        return repository.findAll();
    }

    // 6. Find by ID
    public Optional<Institute> findById(long id) 
    {
        return repository.findById(id);
    }

    // 7-10. Find by field
    public Optional<Institute> findByName(String name)         
    { 
    	return repository.findByName(name); 
    }
    public Optional<Institute> findByLocation(String location) 
    { 
    	return repository.findByLocation(location); 
    }
    public Optional<Institute> findByFee(Double fee)           
    { 
    	return repository.findByFee(fee); 
    }
    public Optional<Institute> findByFaculty(String faculty)   
    { 
    	return repository.findByFaculty(faculty); 
    }
 // 11. Partial update (PATCH)
    public Institute partialUpdate(Institute institute, long id) 
    {
        Optional<Institute> opt = repository.findById(id);
        if (opt.isEmpty()) 
        {
            institute.setId(id);
            return repository.save(institute);
        }
        Institute existing = opt.get();
        if (institute.getName() != null)     existing.setName(institute.getName());
        if (institute.getLocation() != null) existing.setLocation(institute.getLocation());
        if (institute.getFee() != null)      existing.setFee(institute.getFee());
        if (institute.getFaculty() != null)  existing.setFaculty(institute.getFaculty());
        return repository.save(existing);
    }


//12. Full update (PUT) // Upsert = update+save
public Institute update(Institute institute, long id) 
{
    Optional<Institute> opt = repository.findById(id);
    if (opt.isEmpty()) 
    {
        institute.setId(id);
        return repository.save(institute);
    }
    Institute existing = opt.get();
    existing.setName(institute.getName());
    existing.setLocation(institute.getLocation());
    existing.setFee(institute.getFee());
    existing.setFaculty(institute.getFaculty());
    return repository.save(existing);
	}
//13. Custom @Query
public List<Institute> customQuery() 
{
    return repository.customQuery();
}

// 14. Pagination
public List<Institute> pagination() 
{
    PageRequest request = PageRequest.of(0, 3); // page 0 = first page
    return repository.findAll(request).toList();
}

// 15. AND  ← FIX: was returning null
public List<Institute> findByNameAndTotal(String name, double total) 
{
    return repository.findByNameAndFee(name, total);
}

// 16. OR  ← FIX: was returning null
public List<Institute> findByNameOrId(String name, long id) 
{
    return repository.findByNameOrId(name, id);
}
// 17. Between  ← FIX: was returning null
public List<Institute> findByIdBetween(long start, long end) 
{
    return repository.findByIdBetween(start, end);
}

// 18. Greater than  ← FIX: was returning null
public List<Institute> findByIdGreaterThan(long num) 
{
    return repository.findByIdGreaterThan(num);
}

// 19. Less than  ← FIX: was returning null
public List<Institute> findByIdLessThan(long id)
{
    return repository.findByIdLessThan(id);
}

// 20. Sort  ← FIX: was returning null
public List<Institute> sort(String field) 
{
    Sort sort = Sort.by(Sort.Direction.ASC, field);
    return repository.findAll(sort);
}
// 21. Like  ← FIX: was returning null; use % wildcards for SQL LIKE
public List<Institute> findByNameLike(String name) 
{
    return repository.findByNameContaining(name);
}

}
