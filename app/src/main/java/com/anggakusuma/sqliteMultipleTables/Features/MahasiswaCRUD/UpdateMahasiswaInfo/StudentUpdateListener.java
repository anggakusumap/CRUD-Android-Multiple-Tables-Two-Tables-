package com.anggakusuma.sqliteMultipleTables.Features.MahasiswaCRUD.UpdateMahasiswaInfo;

import com.anggakusuma.sqliteMultipleTables.Features.MahasiswaCRUD.CreateMahasiswa.Student;

public interface StudentUpdateListener {
    void onStudentInfoUpdated(Student student, int position);
}
