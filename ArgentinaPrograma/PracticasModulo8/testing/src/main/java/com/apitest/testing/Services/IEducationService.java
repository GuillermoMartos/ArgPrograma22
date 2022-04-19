package com.apitest.testing.Services;

import java.util.List;


import com.apitest.testing.Model.DeleterLong;
import com.apitest.testing.Model.Education;

public interface IEducationService {
    public void create_education(Education new_education);
    public void update_education(Education education);
    public void delete_education(DeleterLong id_education);
    public List<Education> list_education();
    public List<Education> get_education(Number id_user);

}
