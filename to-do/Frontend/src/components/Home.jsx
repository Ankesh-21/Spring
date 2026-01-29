import React from "react";

const Home = () => {
  const [tasks, setTasks] = React.useState([]);
  const [loading, setLoading] = React.useState(true);
  React.useEffect(() => {
    const fetchTasks = async () => {
      try {
        const res = await fetch("http://localhost:8080/api/tasks");
        const data = await res.json();
        console.log(data);
        setTasks(data);
        setLoading(false);
      } catch (err) {
        console.log(err);
        setLoading(false);
      }
    };
    fetchTasks();
  },[]);
  if (loading) return <>Loading....</>
  return (
    <>
        <h1>{tasks}</h1>
    </>
  )
};

export default Home;
