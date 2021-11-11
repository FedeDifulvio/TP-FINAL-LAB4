#CONSULTAS
select p.id as 'ID PAIS', p.nombre as 'PAIS', pr.id as 'ID PROVINCIA', pr.nombre as 'PROVINCIA', l.id as 'ID LOCALIDAD', l.nombre as 'LOCALIDAD'
from localidad as l
inner join provincia as pr on l.id_provincia = pr.id
inner join pais as p on pr.id_pais = p.id;