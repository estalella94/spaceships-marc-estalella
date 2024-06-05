package com.example.spaceships.spaceships_marc_estalella.services;


//import com.example.spaceships.spaceships_marc_estalella.repositories.SpaceshipRepository;


public class SpaceshipServiceTest {
    
    // @Mock
    // private SpaceshipRepository spaceshipRepository;

    // @InjectMocks
    // private SpaceshipsService spaceshipService;

    // @BeforeEach
    // public void setUp() {
    //     MockitoAnnotations.openMocks(this);
    // }

    // @Test
    // void testGetSpaceshipById() {
    //     Spaceship spaceship = new Spaceship();
    //     spaceship.setId(1L);
    //     spaceship.setName("X-Wing");
    //     when(spaceshipRepository.findById(1L)).thenReturn(Optional.of(spaceship));

    //     Spaceship found = spaceshipService.getSpaceshipById(1L);

    //     assertEquals("X-Wing", found.getName());
    //     verify(spaceshipRepository, times(1)).findById(1L);
    // }

    // @Test
    // void testGetSpaceshipByIdNotFound() {
    //     when(spaceshipRepository.findById(1L)).thenReturn(Optional.empty());

    //     assertThrows(ResourceNotFoundException.class, () -> {
    //         spaceshipService.getSpaceshipById(1L);
    //     });
    // }

    // @Test
    // void testCreateSpaceship() {
    //     Spaceship spaceship = new Spaceship();
    //     spaceship.setName("Millennium Falcon");
    //     spaceship.setSeries("Star Wars");
    //     when(spaceshipRepository.save(spaceship)).thenReturn(spaceship);

    //     Spaceship created = spaceshipService.createSpaceship(spaceship);

    //     assertNotNull(created);
    //     assertEquals("Millennium Falcon", created.getName());
    //     verify(spaceshipRepository, times(1)).save(spaceship);
    // }

    // @Test
    // void testUpdateSpaceship() {
    //     Spaceship spaceship = new Spaceship();
    //     spaceship.setId(1L);
    //     spaceship.setName("X-Wing");
    //     spaceship.setSeries("Star Wars");

    //     Spaceship updatedDetails = new Spaceship();
    //     updatedDetails.setName("Y-Wing");
    //     updatedDetails.setSeries("Star Wars");

    //     when(spaceshipRepository.findById(1L)).thenReturn(Optional.of(spaceship));
    //     when(spaceshipRepository.save(spaceship)).thenReturn(spaceship);

    //     Spaceship updated = spaceshipService.updateSpaceship(1L, updatedDetails);

    //     assertEquals("Y-Wing", updated.getName());
    //     verify(spaceshipRepository, times(1)).findById(1L);
    //     verify(spaceshipRepository, times(1)).save(spaceship);
    // }

    // @Test
    // void testUpdateSpaceshipNotFound() {
    //     Spaceship updatedDetails = new Spaceship();
    //     updatedDetails.setName("Y-Wing");
    //     updatedDetails.setSeries("Star Wars");

    //     when(spaceshipRepository.findById(1L)).thenReturn(Optional.empty());

    //     assertThrows(ResourceNotFoundException.class, () -> {
    //         spaceshipService.updateSpaceship(1L, updatedDetails);
    //     });
    // }

    // @Test
    // void testDeleteSpaceship() {
    //     Spaceship spaceship = new Spaceship();
    //     spaceship.setId(1L);
    //     spaceship.setName("X-Wing");

    //     when(spaceshipRepository.findById(1L)).thenReturn(Optional.of(spaceship));
    //     doNothing().when(spaceshipRepository).delete(spaceship);

    //     spaceshipService.deleteSpaceship(1L);

    //     verify(spaceshipRepository, times(1)).findById(1L);
    //     verify(spaceshipRepository, times(1)).delete(spaceship);
    // }

    // @Test
    // void testDeleteSpaceshipNotFound() {
    //     when(spaceshipRepository.findById(1L)).thenReturn(Optional.empty());

    //     assertThrows(ResourceNotFoundException.class, () -> {
    //         spaceshipService.deleteSpaceship(1L);
    //     });
    // }
}
