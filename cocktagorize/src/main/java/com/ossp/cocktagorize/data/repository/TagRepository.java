package com.ossp.cocktagorize.data.repository;

import com.ossp.cocktagorize.data.entity.Tag;
import com.ossp.cocktagorize.data.type.TagType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, Integer> {
    Tag findTagByName(String name);
}