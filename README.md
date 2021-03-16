## Backend Task 2

**Application like Oyo room has to be created**

### Package Structure

**base package : com.cg.apps.hotelbooking**

- com.cg.apps.hotelbooking
                    - hotelms
                      - entites, dao, services etc
                    - roomms
                      - entites, dao, services etc
                    - guestms
                      - entites, dao, services etc
  

### Tasks
1. Find all available rooms in hotel.
2. Allot Room for a guest in hotel.
3. Guest can checkout
4. Find all guests currently living in hotel.
5. Find all guests who checked out today from hotel.

### Sprints
1. **Sprint 1: ** Create Project
2. **Sprint 2: ** Create hotelms (skip relation part with rooms). Check if it is working in UI.
3. **Sprint 3: ** Create roomms (skip relation part with hotel). Check if it is working in UI.
4. **Sprint 4: ** Setup relation between Hotel and Room. Complete and correct the service implementions.
5. **Sprint 5: ** Create guestms. Setup relation between Guest, GuestTransaction and with Room, complete service implementation.
6. **Sprint 6: ** Open REST endpoints for hotel service.
7. **Sprint 7: ** Open REST endpoints for room service.
8. **Sprint 8: ** Open REST endpoints for guest service.

### Rest endpoints

#### Hotel Endpoints
- Add Hotel.
- Find hotel by ID.
- Find all guests living in a hotel.
- Find all guests checked out today.

#### Room service endpoints
- Add Room
- Find Room by ID.
- Find room by floor number and room number.
- Find all rooms in a hotel.
- Find all available rooms in a hotel.

#### Guest Service endpoints
- allot a room for a guest
- guest checked out from hotel 
- transaction history of a guest
 
 
         GuestTransaction {
                  id:Long
                  amount: double
                  dateTime: LocalDateTime
                  guest:Guest
         }


         Guest {
                  id:Long
                  name: String
                  adharId: String
                  room:Room
                  rentedDateTime:LocalDateTime;
                  transactions: List<GuestTransaction>
                  recentTransaction: GuestTransaction
                  checkoutDateTime: LocalDateTime
         }



         IGuestService {
                  Guest findById(Long guestId)
                  Guest allotRoom(String adharId, String guestName, Long hotelId, int roomNumber, int floorNumber, double rent)
                  List<GuestTransaction> transactionsHistory(Long guestId)
                  Guest checkout(Long guestId, Long hotelId, int roomNumber, int floorNumber)
         }


         Hotel {
                  hotelId : Long
                  hotelName: String
                  address: String 
                  rooms: List<Room>
         }

         IHotelService {
                  Hotel findById(Long hotelId)
                  Hotel addHotel(String hotelName, String address, List<Room> rooms)
                  Set<Guest> findAllGuestsLivingInHotel(Long hotelId)
                  List<Guest> findAllGuestsCheckedOutTodayInHotel(Long hotelId)
         }


         Room {
                  roomId:Long
                  floorNumer: Integer
                  roomNumber: Integer
                  hotel : Hotel
                  available : Boolean
                  cost: double
         }


         IRoomService {
                  Room addroom(Long hotelId, int floorNo, int roomNo) 
                  Room findById(Long roomId)
                  Room findRoom(int floorNo, int roomNo)
                  List<Room> findAllRoomsInHotel(Long hotelId)
                  List<Room> availableRoomsInHotel(Long hotelId)
         }
